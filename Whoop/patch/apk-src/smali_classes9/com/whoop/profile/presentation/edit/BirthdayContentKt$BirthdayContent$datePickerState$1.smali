.class public final Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll1/n3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1",
        "Ll1/n3;",
        "",
        "utcTimeMillis",
        "",
        "isSelectableDate",
        "(J)Z",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $maxAgeMillis:J

.field final synthetic $minAgeMillis:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;->$maxAgeMillis:J

    iput-wide p3, p0, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;->$minAgeMillis:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isSelectableDate(J)Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;->$maxAgeMillis:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    cmp-long v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    iget-wide v2, p0, Lcom/whoop/profile/presentation/edit/BirthdayContentKt$BirthdayContent$datePickerState$1;->$minAgeMillis:J

    cmp-long p1, p1, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public bridge isSelectableYear(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
