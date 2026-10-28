.class public abstract Lmb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final endVersion:I

.field public final startVersion:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmb/b;->startVersion:I

    iput p2, p0, Lmb/b;->endVersion:I

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    instance-of v0, p1, Lwb/a;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Lwb/a;

    .line 7
    iget-object p1, p1, Lwb/a;->w:Lub/a;

    .line 8
    invoke-virtual {p0, p1}, Lmb/b;->migrate(Lub/a;)V

    return-void

    .line 9
    :cond_0
    new-instance p1, Ll83/j;

    .line 10
    const-string v0, "Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function."

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 12
    throw p1
.end method

.method public migrate(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Ll83/j;

    .line 2
    const-string v0, "Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function."

    .line 3
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 4
    throw p1
.end method
