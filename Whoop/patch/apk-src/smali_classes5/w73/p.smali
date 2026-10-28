.class public final Lw73/p;
.super Lw73/a;
.source "SourceFile"


# instance fields
.field public final x:Ll73/g;

.field public final y:I


# direct methods
.method public constructor <init>(Ll73/c;Ll73/g;I)V
    .locals 0

    invoke-direct {p0, p1}, Lw73/a;-><init>(Ll73/c;)V

    iput-object p2, p0, Lw73/p;->x:Ll73/g;

    iput p3, p0, Lw73/p;->y:I

    return-void
.end method


# virtual methods
.method public final d(Ll73/d;)V
    .locals 4

    iget-object v0, p0, Lw73/p;->x:Ll73/g;

    instance-of v1, v0, Ly73/q;

    iget-object v2, p0, Lw73/a;->w:Ll73/c;

    if-eqz v1, :cond_0

    invoke-virtual {v2, p1}, Ll73/c;->c(Ll73/d;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ll73/g;->a()Ll73/f;

    move-result-object v0

    new-instance v1, Lw73/o;

    iget v3, p0, Lw73/p;->y:I

    invoke-direct {v1, p1, v0, v3}, Lw73/o;-><init>(Ll73/d;Ll73/f;I)V

    invoke-virtual {v2, v1}, Ll73/c;->c(Ll73/d;)V

    return-void
.end method
