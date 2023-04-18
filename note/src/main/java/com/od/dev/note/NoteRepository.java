package com.od.dev.note;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository {

    public List<Note> findAll();

    public Note save(Note note);

    public void deleteById(long id);

    public List<Note> findById(long id);
}
