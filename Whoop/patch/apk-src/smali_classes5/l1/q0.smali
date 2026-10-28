.class public final synthetic Ll1/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lm1/o;

.field public final synthetic G:Li93/j;

.field public final synthetic H:Ll1/e0;

.field public final synthetic I:Ll1/n3;

.field public final synthetic J:Ll1/y;

.field public final synthetic K:Lg2/s;

.field public final synthetic w:Ljava/lang/Long;

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/q0;->w:Ljava/lang/Long;

    iput-wide p2, p0, Ll1/q0;->x:J

    iput p4, p0, Ll1/q0;->y:I

    iput-object p5, p0, Ll1/q0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll1/q0;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ll1/q0;->F:Lm1/o;

    iput-object p8, p0, Ll1/q0;->G:Li93/j;

    iput-object p9, p0, Ll1/q0;->H:Ll1/e0;

    iput-object p10, p0, Ll1/q0;->I:Ll1/n3;

    iput-object p11, p0, Ll1/q0;->J:Ll1/y;

    iput-object p12, p0, Ll1/q0;->K:Lg2/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v13

    iget-object v0, p0, Ll1/q0;->w:Ljava/lang/Long;

    iget-wide v1, p0, Ll1/q0;->x:J

    iget v3, p0, Ll1/q0;->y:I

    iget-object v4, p0, Ll1/q0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll1/q0;->E:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ll1/q0;->F:Lm1/o;

    iget-object v7, p0, Ll1/q0;->G:Li93/j;

    iget-object v8, p0, Ll1/q0;->H:Ll1/e0;

    iget-object v9, p0, Ll1/q0;->I:Ll1/n3;

    iget-object v10, p0, Ll1/q0;->J:Ll1/y;

    iget-object v11, p0, Ll1/q0;->K:Lg2/s;

    invoke-static/range {v0 .. v13}, Ll1/f1;->k(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
