.class public final Lvb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/e;


# instance fields
.field public final E:Z

.field public final F:Ll83/p;

.field public G:Z

.field public final w:Landroid/content/Context;

.field public final x:Ljava/lang/String;

.field public final y:Lub/b;

.field public final z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lub/b;ZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb/i;->w:Landroid/content/Context;

    iput-object p2, p0, Lvb/i;->x:Ljava/lang/String;

    iput-object p3, p0, Lvb/i;->y:Lub/b;

    iput-boolean p4, p0, Lvb/i;->z:Z

    iput-boolean p5, p0, Lvb/i;->E:Z

    new-instance p1, Lm83/p;

    const/16 p2, 0x11

    invoke-direct {p1, p0, p2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lvb/i;->F:Ll83/p;

    return-void
.end method


# virtual methods
.method public final E0()Lub/a;
    .locals 2

    iget-object v0, p0, Lvb/i;->F:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/h;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lvb/h;->b(Z)Lub/a;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lvb/i;->F:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/h;

    invoke-virtual {v0}, Lvb/h;->close()V

    :cond_0
    return-void
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvb/i;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    iget-object v0, p0, Lvb/i;->F:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/h;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_0
    iput-boolean p1, p0, Lvb/i;->G:Z

    return-void
.end method
