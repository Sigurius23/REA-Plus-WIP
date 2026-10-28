.class public final Lbc/a;
.super Lbc/c0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lbc/c0;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbc/c0;->f0:Z

    new-instance v0, Lbc/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lbc/h;-><init>(I)V

    invoke-virtual {p0, v0}, Lbc/c0;->P(Lbc/w;)V

    new-instance v0, Lbc/f;

    invoke-direct {v0}, Lbc/w;-><init>()V

    invoke-virtual {p0, v0}, Lbc/c0;->P(Lbc/w;)V

    new-instance v0, Lbc/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lbc/h;-><init>(I)V

    invoke-virtual {p0, v0}, Lbc/c0;->P(Lbc/w;)V

    return-void
.end method
