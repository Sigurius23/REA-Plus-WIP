.class public final synthetic Lrf/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/z;


# instance fields
.field public final synthetic E:[Lud3/a0;

.field public final synthetic w:Lud3/q;

.field public final synthetic x:Lrf/r;

.field public final synthetic y:Lud3/u;

.field public final synthetic z:Lqf/b;


# direct methods
.method public synthetic constructor <init>(Lud3/q;Lrf/r;Lud3/u;Lqf/b;[Lud3/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/s;->w:Lud3/q;

    iput-object p2, p0, Lrf/s;->x:Lrf/r;

    iput-object p3, p0, Lrf/s;->y:Lud3/u;

    iput-object p4, p0, Lrf/s;->z:Lqf/b;

    iput-object p5, p0, Lrf/s;->E:[Lud3/a0;

    return-void
.end method


# virtual methods
.method public final b(Lzd3/o;)Lud3/a0;
    .locals 9

    new-instance v0, Lrf/a;

    new-instance v1, Lkotlin/jvm/internal/k0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lkotlin/jvm/internal/k0;-><init>(I)V

    new-instance v3, Lrf/f;

    iget-object v2, p0, Lrf/s;->x:Lrf/r;

    iget-object v5, v2, Lpf/i;->h:Lbg/g;

    iget-object v4, p0, Lrf/s;->w:Lud3/q;

    iget-object v6, p0, Lrf/s;->y:Lud3/u;

    iget-object v7, p0, Lrf/s;->z:Lqf/b;

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Lrf/f;-><init>(Lud3/q;Lbg/g;Lud3/u;Lqf/b;Lzd3/o;)V

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lrf/s;->E:[Lud3/a0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    iget-object p1, v1, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lud3/a0;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v1, "elements"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lrf/a;-><init>(Ljava/util/List;)V

    return-object v0
.end method
