.class public final synthetic Ll1/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll1/e0;

.field public final synthetic F:Ll1/n3;

.field public final synthetic G:Ll1/y;

.field public final synthetic H:Ljava/util/Locale;

.field public final synthetic w:Lm1/r;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(Lm1/r;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;Ljava/util/Locale;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/l0;->w:Lm1/r;

    iput-object p2, p0, Ll1/l0;->x:Lkotlin/jvm/functions/Function1;

    iput-wide p3, p0, Ll1/l0;->y:J

    iput-object p5, p0, Ll1/l0;->z:Ljava/lang/Long;

    iput-object p6, p0, Ll1/l0;->E:Ll1/e0;

    iput-object p7, p0, Ll1/l0;->F:Ll1/n3;

    iput-object p8, p0, Ll1/l0;->G:Ll1/y;

    iput-object p9, p0, Ll1/l0;->H:Ljava/util/Locale;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x36001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Ll1/l0;->w:Lm1/r;

    iget-object v1, p0, Ll1/l0;->x:Lkotlin/jvm/functions/Function1;

    iget-wide v2, p0, Ll1/l0;->y:J

    iget-object v4, p0, Ll1/l0;->z:Ljava/lang/Long;

    iget-object v5, p0, Ll1/l0;->E:Ll1/e0;

    iget-object v6, p0, Ll1/l0;->F:Ll1/n3;

    iget-object v7, p0, Ll1/l0;->G:Ll1/y;

    iget-object v8, p0, Ll1/l0;->H:Ljava/util/Locale;

    invoke-static/range {v0 .. v10}, Ll1/f1;->i(Lm1/r;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
