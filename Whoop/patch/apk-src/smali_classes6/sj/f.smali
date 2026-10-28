.class public final Lsj/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lcom/amplitude/android/engagement/types/ButtonBlock;

.field public final synthetic F:Lcom/amplitude/android/engagement/a;

.field public final synthetic G:Lsj/l;

.field public final synthetic w:Z

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lcom/amplitude/android/engagement/types/Action;


# direct methods
.method public constructor <init>(ZLandroid/content/Context;Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonBlock;Lcom/amplitude/android/engagement/a;Lsj/l;)V
    .locals 0

    iput-boolean p1, p0, Lsj/f;->w:Z

    iput-object p2, p0, Lsj/f;->x:Landroid/content/Context;

    iput-object p3, p0, Lsj/f;->y:Ljava/lang/String;

    iput-object p4, p0, Lsj/f;->z:Lcom/amplitude/android/engagement/types/Action;

    iput-object p5, p0, Lsj/f;->E:Lcom/amplitude/android/engagement/types/ButtonBlock;

    iput-object p6, p0, Lsj/f;->F:Lcom/amplitude/android/engagement/a;

    iput-object p7, p0, Lsj/f;->G:Lsj/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lcom/amplitude/android/engagement/types/Action;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lsj/f;->w:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsj/f;->y:Ljava/lang/String;

    const/4 v0, 0x0

    iget-object v1, p0, Lsj/f;->x:Landroid/content/Context;

    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsj/f;->z:Lcom/amplitude/android/engagement/types/Action;

    instance-of v0, p1, Lcom/amplitude/android/engagement/types/ClickAction;

    iget-object v1, p0, Lsj/f;->E:Lcom/amplitude/android/engagement/types/ButtonBlock;

    iget-object v2, p0, Lsj/f;->G:Lsj/l;

    iget-object v3, p0, Lsj/f;->F:Lcom/amplitude/android/engagement/a;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/ClickAction;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ClickAction;->getValue()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lnj/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "identifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lnj/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/ButtonBlock;->getMeta()Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-result-object p1

    iget-object v0, v2, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v0

    new-instance v1, Lcom/amplitude/android/engagement/types/StepForwardAction;

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v2}, Lcom/amplitude/android/engagement/types/StepForwardAction;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v0, v1, p1}, Lcom/amplitude/android/engagement/a;->c(ILcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonMeta;)V

    goto :goto_0

    :cond_1
    iget-object v0, v2, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v0

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/ButtonBlock;->getMeta()Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-result-object v1

    invoke-virtual {v3, v0, p1, v1}, Lcom/amplitude/android/engagement/a;->c(ILcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonMeta;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
