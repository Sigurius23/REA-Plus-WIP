.class public final Lpj/d0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:Lbc3/c0;

.field public final synthetic x:Lmj/p;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lcom/amplitude/android/engagement/types/TooltipFormFactor;


# direct methods
.method public constructor <init>(IIJLbc3/c0;Lcom/amplitude/android/engagement/types/TooltipFormFactor;Ljava/lang/String;Lmj/p;Lp1/c1;)V
    .locals 0

    iput-object p5, p0, Lpj/d0;->w:Lbc3/c0;

    iput-object p8, p0, Lpj/d0;->x:Lmj/p;

    iput-object p7, p0, Lpj/d0;->y:Ljava/lang/String;

    iput-object p6, p0, Lpj/d0;->z:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iput-wide p3, p0, Lpj/d0;->E:J

    iput p1, p0, Lpj/d0;->F:I

    iput p2, p0, Lpj/d0;->G:I

    iput-object p9, p0, Lpj/d0;->H:Lp1/c1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    new-instance v0, Lpj/c0;

    const/4 v9, 0x0

    const/4 v10, 0x1

    iget-object v1, p0, Lpj/d0;->x:Lmj/p;

    iget-object v2, p0, Lpj/d0;->y:Ljava/lang/String;

    iget-object v3, p0, Lpj/d0;->z:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iget-wide v4, p0, Lpj/d0;->E:J

    iget v6, p0, Lpj/d0;->F:I

    iget v7, p0, Lpj/d0;->G:I

    iget-object v8, p0, Lpj/d0;->H:Lp1/c1;

    invoke-direct/range {v0 .. v10}, Lpj/c0;-><init>(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lpj/d0;->w:Lbc3/c0;

    const/4 v3, 0x0

    invoke-static {v2, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
