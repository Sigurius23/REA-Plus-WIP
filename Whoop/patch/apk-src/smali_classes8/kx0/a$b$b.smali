.class final Lkx0/a$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkx0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lkotlin/jvm/internal/e0;

.field final synthetic x:Lkx0/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/e0;Lkx0/a;)V
    .locals 0

    iput-object p1, p0, Lkx0/a$b$b;->w:Lkotlin/jvm/internal/e0;

    iput-object p2, p0, Lkx0/a$b$b;->x:Lkx0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/straphistorysync/sync/f;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/whoop/straphistorysync/sync/f;->c()I

    move-result p2

    iget-object v0, p0, Lkx0/a$b$b;->w:Lkotlin/jvm/internal/e0;

    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    sub-int/2addr p2, v0

    const/16 v0, 0x1f4

    if-lt p2, v0, :cond_0

    iget-object p2, p0, Lkx0/a$b$b;->x:Lkx0/a;

    invoke-static {p2}, Lkx0/a;->i(Lkx0/a;)Ltr2/n;

    move-result-object p2

    invoke-interface {p1}, Lcom/whoop/straphistorysync/sync/f;->c()I

    move-result v0

    const-string v1, "Mid-sync upload triggered at burst "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lkx0/a$b$b;->x:Lkx0/a;

    invoke-static {p2}, Lkx0/a;->h(Lkx0/a;)Ldt0/d;

    move-result-object p2

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->IMPLICIT_UPLOAD:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-interface {p2, v0}, Ldt0/d;->c(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V

    iget-object p2, p0, Lkx0/a$b$b;->w:Lkotlin/jvm/internal/e0;

    invoke-interface {p1}, Lcom/whoop/straphistorysync/sync/f;->c()I

    move-result p1

    iput p1, p2, Lkotlin/jvm/internal/e0;->w:I

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/straphistorysync/sync/f;

    invoke-virtual {p0, p1, p2}, Lkx0/a$b$b;->b(Lcom/whoop/straphistorysync/sync/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
