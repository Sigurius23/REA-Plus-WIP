.class public final Lio0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio0/n$a;,
        Lio0/n$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lio0/l;",
        "Lio0/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u0018B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J9\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio0/n;",
        "Lod1/g;",
        "Lio0/l;",
        "Lio0/m;",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;Ltr2/n;)V",
        "",
        "usState",
        "rescheduleAppointmentId",
        "Lec3/l;",
        "Lio0/n$b;",
        "g",
        "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "selectedTimeSlot",
        "intakeResponses",
        "h",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;",
        "b",
        "Ltr2/n;",
        "c",
        "clinician-in-the-loop_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final c:Lio0/n$a;

.field public static final d:I


# instance fields
.field private final a:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;

.field private final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio0/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio0/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio0/n;->c:Lio0/n$a;

    const/16 v0, 0x8

    sput v0, Lio0/n;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio0/n;->a:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;

    .line 3
    iput-object p2, p0, Lio0/n;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "ClinicianVideoSchedulingFormInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lio0/n;-><init>(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lio0/n;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;
    .locals 0

    iget-object p0, p0, Lio0/n;->a:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;

    return-object p0
.end method

.method public static final synthetic d(Lio0/n;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lio0/n;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lio0/n;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio0/n;->g(Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lio0/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio0/n;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lio0/n$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lio0/n$c;-><init>(Lio0/n;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lio0/n$h;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    move-object v1, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lio0/n$h;-><init>(Ljava/lang/String;Lio0/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio0/n$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lio0/n$d;-><init>(Lq83/d;Lio0/n;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lio0/m;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lio0/m;-><init>(Lio0/h;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lio0/n$g;

    invoke-direct {v0, v1}, Lio0/n$g;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
