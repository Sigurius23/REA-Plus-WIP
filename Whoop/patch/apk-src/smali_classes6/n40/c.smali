.class public final Ln40/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Leb/u0;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lec3/t1;

.field public final synthetic y:Landroid/app/Activity;

.field public final synthetic z:Ld1/j;


# direct methods
.method public constructor <init>(Lec3/t1;Landroid/app/Activity;Ld1/j;Leb/u0;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ln40/c;->x:Lec3/t1;

    iput-object p2, p0, Ln40/c;->y:Landroid/app/Activity;

    iput-object p3, p0, Ln40/c;->z:Ld1/j;

    iput-object p4, p0, Ln40/c;->E:Leb/u0;

    iput-object p5, p0, Ln40/c;->F:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Ln40/c;

    iget-object v4, p0, Ln40/c;->E:Leb/u0;

    iget-object v5, p0, Ln40/c;->F:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln40/c;->x:Lec3/t1;

    iget-object v2, p0, Ln40/c;->y:Landroid/app/Activity;

    iget-object v3, p0, Ln40/c;->z:Ld1/j;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ln40/c;-><init>(Lec3/t1;Landroid/app/Activity;Ld1/j;Leb/u0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Ln40/c;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln40/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln40/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln40/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln40/c;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v0, Lcz/d;

    const/4 v5, 0x0

    const/16 v6, 0xb

    iget-object v1, p0, Ln40/c;->y:Landroid/app/Activity;

    iget-object v2, p0, Ln40/c;->z:Ld1/j;

    iget-object v3, p0, Ln40/c;->E:Leb/u0;

    iget-object v4, p0, Ln40/c;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v0 .. v6}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    iget-object v3, p0, Ln40/c;->x:Lec3/t1;

    invoke-direct {v1, v3, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v1, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
