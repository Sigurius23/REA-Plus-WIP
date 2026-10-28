.class public final synthetic Ll0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll0/i1;->w:F

    iput p2, p0, Ll0/i1;->x:F

    iput p3, p0, Ll0/i1;->y:F

    iput p4, p0, Ll0/i1;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lb3/l2;

    const-string v0, "padding"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Ll0/i1;->w:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "start"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Ll0/i1;->x:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "top"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Ll0/i1;->y:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "end"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    new-instance v0, Ly3/f;

    iget v1, p0, Ll0/i1;->z:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "bottom"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
