.class public final synthetic Lch0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg1/y3;

.field public final synthetic F:Lg1/y3;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Lc93/a;

.field public final synthetic K:Lp1/c1;

.field public final synthetic L:Lp1/c1;

.field public final synthetic w:Lzg0/i;

.field public final synthetic x:Lf0/r1;

.field public final synthetic y:Lch0/o0;

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Lzg0/i;Lf0/r1;Lch0/o0;Lbc3/c0;Lg1/y3;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/g0;->w:Lzg0/i;

    iput-object p2, p0, Lch0/g0;->x:Lf0/r1;

    iput-object p3, p0, Lch0/g0;->y:Lch0/o0;

    iput-object p4, p0, Lch0/g0;->z:Lbc3/c0;

    iput-object p5, p0, Lch0/g0;->E:Lg1/y3;

    iput-object p6, p0, Lch0/g0;->F:Lg1/y3;

    iput-object p7, p0, Lch0/g0;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lch0/g0;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lch0/g0;->I:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lch0/g0;->J:Lc93/a;

    iput-object p11, p0, Lch0/g0;->K:Lp1/c1;

    iput-object p12, p0, Lch0/g0;->L:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lch0/g0;->w:Lzg0/i;

    iget-object v1, p0, Lch0/g0;->x:Lf0/r1;

    iget-object v2, p0, Lch0/g0;->y:Lch0/o0;

    iget-object v3, p0, Lch0/g0;->z:Lbc3/c0;

    iget-object v4, p0, Lch0/g0;->E:Lg1/y3;

    iget-object v5, p0, Lch0/g0;->F:Lg1/y3;

    iget-object v6, p0, Lch0/g0;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lch0/g0;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lch0/g0;->I:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lch0/g0;->J:Lc93/a;

    iget-object v10, p0, Lch0/g0;->K:Lp1/c1;

    iget-object v11, p0, Lch0/g0;->L:Lp1/c1;

    invoke-static/range {v0 .. v13}, Lch0/m0;->b(Lzg0/i;Lf0/r1;Lch0/o0;Lbc3/c0;Lg1/y3;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
