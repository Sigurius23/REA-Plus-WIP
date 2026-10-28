.class final Lcn0/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn0/a;->f(Lkb1/e;)Ly81/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
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
.field final synthetic w:Lkb1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic x:F


# direct methods
.method public constructor <init>(Lkb1/e;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;F)V"
        }
    .end annotation

    iput-object p1, p0, Lcn0/a$l;->w:Lkb1/e;

    iput p2, p0, Lcn0/a$l;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 2

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcn0/a$l;->w:Lkb1/e;

    invoke-virtual {v0}, Lkb1/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ly81/i;->x0()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ly81/i;->w0()J

    move-result-wide v0

    :goto_0
    iget p1, p0, Lcn0/a$l;->x:F

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lcn0/a$l;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
