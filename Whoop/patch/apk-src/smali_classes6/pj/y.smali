.class public final Lpj/y;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:Lmj/p;

.field public final synthetic x:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/NudgeStep;

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Ljava/lang/String;Lmj/p;Lp1/c1;)V
    .locals 0

    iput-object p5, p0, Lpj/y;->w:Lmj/p;

    iput-object p2, p0, Lpj/y;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p3, p0, Lpj/y;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p1, p0, Lpj/y;->z:Lbc3/c0;

    iput-object p4, p0, Lpj/y;->E:Ljava/lang/String;

    iput-object p6, p0, Lpj/y;->F:Lp1/c1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Lp1/i0;

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpj/x;

    iget-object v5, p0, Lpj/y;->E:Ljava/lang/String;

    iget-object v7, p0, Lpj/y;->F:Lp1/c1;

    iget-object v2, p0, Lpj/y;->z:Lbc3/c0;

    iget-object v3, p0, Lpj/y;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v4, p0, Lpj/y;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v6, p0, Lpj/y;->w:Lmj/p;

    invoke-direct/range {v1 .. v7}, Lpj/x;-><init>(Lbc3/c0;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Ljava/lang/String;Lmj/p;Lp1/c1;)V

    iget-object p1, v6, Lmj/p;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, La3/z0;

    invoke-direct {p1, v6, v1}, La3/z0;-><init>(Lmj/p;Lc93/a;)V

    new-instance v0, Lpj/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpj/w;-><init>(La3/z0;I)V

    return-object v0
.end method
