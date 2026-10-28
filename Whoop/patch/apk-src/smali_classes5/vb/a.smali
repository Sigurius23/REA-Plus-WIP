.class public final synthetic Lvb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/sqlite/SQLiteDatabase$CursorFactory;


# instance fields
.field public final synthetic a:Lub/g;


# direct methods
.method public synthetic constructor <init>(Lub/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb/a;->a:Lub/g;

    return-void
.end method


# virtual methods
.method public final newCursor(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 1

    new-instance p1, Landroidx/room/m1;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p1, p4}, Landroidx/room/m1;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    iget-object v0, p0, Lvb/a;->a:Lub/g;

    invoke-interface {v0, p1}, Lub/g;->i(Lub/f;)V

    new-instance p1, Landroid/database/sqlite/SQLiteCursor;

    invoke-direct {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    return-object p1
.end method
