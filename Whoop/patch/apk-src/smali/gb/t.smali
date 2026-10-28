.class public final Lgb/t;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lgb/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgb/t;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lgb/t;->w:Lgb/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly1/b;

    check-cast p2, Leb/u0;

    invoke-virtual {p2}, Leb/a0;->J()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
