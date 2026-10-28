.class public final Lpj/e0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:Lmj/p;

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lcom/amplitude/android/engagement/types/TooltipFormFactor;


# direct methods
.method public constructor <init>(IIJLbc3/c0;Lcom/amplitude/android/engagement/types/TooltipFormFactor;Ljava/lang/String;Lmj/p;Lp1/c1;)V
    .locals 0

    iput-object p8, p0, Lpj/e0;->w:Lmj/p;

    iput-object p5, p0, Lpj/e0;->x:Lbc3/c0;

    iput-object p7, p0, Lpj/e0;->y:Ljava/lang/String;

    iput-object p6, p0, Lpj/e0;->z:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iput-wide p3, p0, Lpj/e0;->E:J

    iput p1, p0, Lpj/e0;->F:I

    iput p2, p0, Lpj/e0;->G:I

    iput-object p9, p0, Lpj/e0;->H:Lp1/c1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Lp1/i0;

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpj/d0;

    iget v3, p0, Lpj/e0;->G:I

    iget-object v10, p0, Lpj/e0;->H:Lp1/c1;

    iget v2, p0, Lpj/e0;->F:I

    iget-wide v4, p0, Lpj/e0;->E:J

    iget-object v6, p0, Lpj/e0;->x:Lbc3/c0;

    iget-object v7, p0, Lpj/e0;->z:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iget-object v8, p0, Lpj/e0;->y:Ljava/lang/String;

    iget-object v9, p0, Lpj/e0;->w:Lmj/p;

    invoke-direct/range {v1 .. v10}, Lpj/d0;-><init>(IIJLbc3/c0;Lcom/amplitude/android/engagement/types/TooltipFormFactor;Ljava/lang/String;Lmj/p;Lp1/c1;)V

    iget-object p1, v9, Lmj/p;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, La3/z0;

    invoke-direct {p1, v9, v1}, La3/z0;-><init>(Lmj/p;Lc93/a;)V

    new-instance v0, Lpj/w;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lpj/w;-><init>(La3/z0;I)V

    return-object v0
.end method
