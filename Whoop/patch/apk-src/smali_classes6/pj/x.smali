.class public final Lpj/x;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lmj/p;

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic x:Lcom/amplitude/android/engagement/types/NudgeStep;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbc3/c0;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Ljava/lang/String;Lmj/p;Lp1/c1;)V
    .locals 0

    iput-object p2, p0, Lpj/x;->w:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p3, p0, Lpj/x;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p1, p0, Lpj/x;->y:Lbc3/c0;

    iput-object p4, p0, Lpj/x;->z:Ljava/lang/String;

    iput-object p5, p0, Lpj/x;->E:Lmj/p;

    iput-object p6, p0, Lpj/x;->F:Lp1/c1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Repositioning Nudge "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lpj/x;->w:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for step: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lpj/x;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/NudgeStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    new-instance v2, Lp33/m;

    const/4 v7, 0x3

    iget-object v3, p0, Lpj/x;->z:Ljava/lang/String;

    iget-object v4, p0, Lpj/x;->E:Lmj/p;

    iget-object v5, p0, Lpj/x;->F:Lp1/c1;

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    iget-object v1, p0, Lpj/x;->y:Lbc3/c0;

    invoke-static {v1, v6, v6, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
