.class public final Ls00/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls00/b;


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Lwz/l1;

.field public final c:Landroidx/lifecycle/k1;

.field public final d:Lg40/o1;

.field public final e:Lec3/r1;


# direct methods
.method public constructor <init>(Lbc3/c0;Lwz/l1;Lwz/r0;Lqy/d;Landroidx/lifecycle/k1;Lyz/b;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLauncher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "logger"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "savedStateHandle"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "linkEventsReporter"

    invoke-static {p6, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls00/a;->a:Lbc3/c0;

    iput-object p2, p0, Ls00/a;->b:Lwz/l1;

    iput-object p5, p0, Ls00/a;->c:Landroidx/lifecycle/k1;

    sget-object p1, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lg40/o1;

    move-result-object p1

    iput-object p1, p0, Ls00/a;->d:Lg40/o1;

    new-instance p1, Ls00/c;

    sget-object p2, Ls00/d;->w:Ls00/d;

    invoke-direct {p1, p2}, Ls00/c;-><init>(Ls00/g;)V

    const-string p2, "LINK_EMBEDDED_STATE_KEY"

    invoke-virtual {p5, p1, p2}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Ls00/a;->e:Lec3/r1;

    return-void
.end method
