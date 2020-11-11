Feature: Fleet module's pages

  Background: common steps
    Given user has logged into vytrack app


  @smoke_test
  Scenario Outline: Check if Fleet module's pages are functioning
    When user clicks on "<page>"
    Then user should land on "<url>"

    Examples:
      | page                   | url                                                               |
      | Vehicles               | https://qa2.vytrack.com/entity/Extend_Entity_Carreservation       |
      | Vehicle Odometer       | https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer     |
      | Vehicle Costs          | https://qa2.vytrack.com/entity/Extend_Entity_VehicleCosts         |
      | Vehicle Contracts      | https://qa2.vytrack.com/entity/Extend_Entity_VehicleContracts     |
      | Vehicles Fuel Logs     | https://qa2.vytrack.com/entity/Extend_Entity_VehiclesFuelLogs     |
      | Vehicles Services Logs | https://qa2.vytrack.com/entity/Extend_Entity_VehiclesServicesLogs |
      | Vehicles Model         | https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel        |
