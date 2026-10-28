.class public final Lib/t;
.super Lib/d;
.source "SourceFile"


# instance fields
.field public final c:Lib/a0;


# direct methods
.method public constructor <init>(Lib/a0;)V
    .locals 0

    invoke-direct {p0}, Lib/j;-><init>()V

    iput-object p1, p0, Lib/t;->c:Lib/a0;

    return-void
.end method


# virtual methods
.method public final a(Lib/h;)V
    .locals 1

    iget-object v0, p0, Lib/t;->c:Lib/a0;

    invoke-virtual {v0, p1}, Lib/j;->a(Lib/h;)V

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lib/t;->c:Lib/a0;

    invoke-virtual {v0}, Lib/j;->c()Z

    move-result v0

    return v0
.end method

.method public final d(Lib/h;)V
    .locals 1

    iget-object v0, p0, Lib/t;->c:Lib/a0;

    invoke-virtual {v0, p1}, Lib/j;->d(Lib/h;)V

    return-void
.end method
