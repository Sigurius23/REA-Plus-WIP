.class public final Lak/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lak/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lak/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lak/d;->w:Lak/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lfk/a;

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "androidx.compose.ui.node.Owner"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lvd/e;->H(Ljava/lang/String;Lfk/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.amplitude.android.internal.locators.ComposeViewTargetLocator"

    invoke-static {v1, v2}, Lvd/e;->H(Ljava/lang/String;Lfk/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lak/b;

    invoke-direct {v1, p1}, Lak/b;-><init>(Lfk/a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance p1, Lak/a;

    invoke-direct {p1}, Lak/a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
