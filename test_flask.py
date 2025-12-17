import pytest
from app import app
@pytest.fixture
def client():
    return app.test_client()

def test_ping(client):
    """
  GIVEN a Flask application configured for testing
  WHEN the '/ping' route is requested (GET)
  THEN check that the response is valid
    """
    response = client.get('/ping')
    assert response.status_code == 200
    assert response.json == {'message': "Pinging Model Application!!"}

    
    