.class public abstract Landroidx/room/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final version:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/room/i1;->version:I

    return-void
.end method


# virtual methods
.method public abstract createAllTables(Lub/a;)V
.end method

.method public abstract dropAllTables(Lub/a;)V
.end method

.method public abstract onCreate(Lub/a;)V
.end method

.method public abstract onOpen(Lub/a;)V
.end method

.method public abstract onPostMigrate(Lub/a;)V
.end method

.method public abstract onPreMigrate(Lub/a;)V
.end method

.method public abstract onValidateSchema(Lub/a;)Landroidx/room/j1;
.end method

.method public validateMigration(Lub/a;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "validateMigration is deprecated"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
