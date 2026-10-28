.class public final Lvb/j;
.super Landroidx/room/m1;
.source "SourceFile"

# interfaces
.implements Lub/h;


# instance fields
.field public final y:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/room/m1;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    iput-object p1, p0, Lvb/j;->y:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public final F()I
    .locals 1

    iget-object v0, p0, Lvb/j;->y:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result v0

    return v0
.end method

.method public final execute()V
    .locals 1

    iget-object v0, p0, Lvb/j;->y:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    return-void
.end method

.method public final i0()J
    .locals 2

    iget-object v0, p0, Lvb/j;->y:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    return-wide v0
.end method
