.class public final Landroidx/room/l0;
.super Lub/b;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroidx/room/n0;


# direct methods
.method public constructor <init>(Landroidx/room/n0;I)V
    .locals 0

    iput-object p1, p0, Landroidx/room/l0;->b:Landroidx/room/n0;

    invoke-direct {p0, p2}, Lub/b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Lvb/c;)V
    .locals 1

    new-instance v0, Lwb/a;

    invoke-direct {v0, p1}, Lwb/a;-><init>(Lub/a;)V

    iget-object p1, p0, Landroidx/room/l0;->b:Landroidx/room/n0;

    invoke-virtual {p1, v0}, Landroidx/room/n0;->c(Ltb/a;)V

    return-void
.end method

.method public final d(Lvb/c;II)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/room/l0;->f(Lvb/c;II)V

    return-void
.end method

.method public final e(Lvb/c;)V
    .locals 2

    new-instance v0, Lwb/a;

    invoke-direct {v0, p1}, Lwb/a;-><init>(Lub/a;)V

    iget-object v1, p0, Landroidx/room/l0;->b:Landroidx/room/n0;

    invoke-virtual {v1, v0}, Landroidx/room/n0;->e(Ltb/a;)V

    iput-object p1, v1, Landroidx/room/n0;->h:Lub/a;

    return-void
.end method

.method public final f(Lvb/c;II)V
    .locals 1

    new-instance v0, Lwb/a;

    invoke-direct {v0, p1}, Lwb/a;-><init>(Lub/a;)V

    iget-object p1, p0, Landroidx/room/l0;->b:Landroidx/room/n0;

    invoke-virtual {p1, p2, p3, v0}, Landroidx/room/n0;->d(IILtb/a;)V

    return-void
.end method
