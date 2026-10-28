.class public final synthetic Ll0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/internal/e0;

.field public final synthetic F:Ll0/t;

.field public final synthetic w:[Ly2/j1;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Ly2/t0;

.field public final synthetic z:Lkotlin/jvm/internal/e0;


# direct methods
.method public synthetic constructor <init>([Ly2/j1;Ljava/util/List;Ly2/t0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Ll0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/s;->w:[Ly2/j1;

    iput-object p2, p0, Ll0/s;->x:Ljava/util/List;

    iput-object p3, p0, Ll0/s;->y:Ly2/t0;

    iput-object p4, p0, Ll0/s;->z:Lkotlin/jvm/internal/e0;

    iput-object p5, p0, Ll0/s;->E:Lkotlin/jvm/internal/e0;

    iput-object p6, p0, Ll0/s;->F:Ll0/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v0, p1

    check-cast v0, Ly2/i1;

    iget-object p1, p0, Ll0/s;->w:[Ly2/j1;

    array-length v7, p1

    const/4 v1, 0x0

    move v8, v1

    :goto_0
    if-ge v8, v7, :cond_0

    move v2, v1

    aget-object v1, p1, v8

    add-int/lit8 v9, v2, 0x1

    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Ll0/s;->x:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    iget-object v3, p0, Ll0/s;->y:Ly2/t0;

    invoke-interface {v3}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    iget-object v4, p0, Ll0/s;->z:Lkotlin/jvm/internal/e0;

    iget v4, v4, Lkotlin/jvm/internal/e0;->w:I

    iget-object v5, p0, Ll0/s;->E:Lkotlin/jvm/internal/e0;

    iget v5, v5, Lkotlin/jvm/internal/e0;->w:I

    iget-object v6, p0, Ll0/s;->F:Ll0/t;

    iget-object v6, v6, Ll0/t;->a:Lb2/h;

    invoke-static/range {v0 .. v6}, Ll0/q;->b(Ly2/i1;Ly2/j1;Ly2/q0;Ly3/m;IILb2/h;)V

    add-int/lit8 v8, v8, 0x1

    move v1, v9

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
