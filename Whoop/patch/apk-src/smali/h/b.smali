.class public final Lh/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:Lh/a;

.field public final synthetic x:Lj/j;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lk/b;


# direct methods
.method public constructor <init>(Lh/a;Lj/j;Ljava/lang/String;Lk/b;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lh/b;->w:Lh/a;

    iput-object p2, p0, Lh/b;->x:Lj/j;

    iput-object p3, p0, Lh/b;->y:Ljava/lang/String;

    iput-object p4, p0, Lh/b;->z:Lk/b;

    iput-object p5, p0, Lh/b;->E:Lp1/c1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lp1/i0;

    new-instance p1, La13/g;

    const/4 v0, 0x1

    iget-object v1, p0, Lh/b;->E:Lp1/c1;

    invoke-direct {p1, v1, v0}, La13/g;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lh/b;->x:Lj/j;

    iget-object v1, p0, Lh/b;->y:Ljava/lang/String;

    iget-object v2, p0, Lh/b;->z:Lk/b;

    invoke-virtual {v0, v1, v2, p1}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object p1

    iget-object v0, p0, Lh/b;->w:Lh/a;

    iput-object p1, v0, Lh/a;->a:Lj/i;

    new-instance p1, Lb3/q0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lb3/q0;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method
