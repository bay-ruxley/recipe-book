# Todo

- [ ] GraphQL   


## DB
- [ ] Check for unique constraint names
- [ ] db blank constrains
  -  (stringexpression <> '') IS NOT TRUE
- [ ] change root password.
- [ ] create a user only allowed to read the required schema and minimal rights.
- [ ] on docker start, read init sql file so a complete empty skeleton can always be created.
- [ ] docker secret file for passwords ([link](https://hub.docker.com/_/postgres))
- [ ] Info before smallserial reaches limit?
- [ ] prevent ids from being inserted?
- [ ] how to make fuzzy searches postgres / spring?
- [ ] how to actually use hibernate
  - [ ] Hibernate x postgres
- [ ] [settings](https://www.postgresql.org/docs/current/functions-admin.html)


## Spring

- [ ] Exception handling
  - [ ] Custom error response for validation errors so field errors can be mapped in UI.
  - [ ] "General" errors 'MediaTypeNotSupported' ...
- [ ] How to mark stuff as "not null"
- [ ] HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
  - [ ] Not sure if I actually need it or not.
- [ ] No LoadTimeWeaver setup: ignoring JPA class transformer
- [ ] spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
- [ ] Tests
  - [ ] E2E?
  - [ ] Unit
  - [ ] Integration tests
  - [ ] with test db?
- [ ] Search endpoints instead of fixed findByField endpoints
- [ ] Generate documentation for endpoint / swagger with javadoc.
  - [ ] mark required and non required fields.
- [ ] user management
  - [ ] login
  - [ ] add the option for Google auth.
  - [ ] Own microservice
- [ ] logging
  - [ ] some ui for logs
  - [ ] own slf4j2 implementation?
- [ ] statistics
- [ ] Hibernate model generation
  - [ ] Maybe even for non jpa models / creation models and error messages
- [ ] micronaut
  - [ ] native?%