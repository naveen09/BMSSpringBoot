## Movie
- id ( pk ) 
- name
- th_id ( fk )
- release_date
- genre

## User
- id ( pk ) 
- name
- phone_number
- email


## Theater
- id ( pk )
- name
- amount
- location


## Booking
- id ( pk )
- m_id ( fk )
- u_id ( fk )
- th_id ( fk )
- ticket_count
- booking_date