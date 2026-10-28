.class public final Lti0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lti0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lti0/h$a;",
        "",
        "<init>",
        "()V",
        "",
        "enabled",
        "isRefreshing",
        "Lti0/h;",
        "a",
        "(ZZ)Lti0/h;",
        "arch-v2_release"
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
.field static final synthetic a:Lti0/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lti0/h$a;

    invoke-direct {v0}, Lti0/h$a;-><init>()V

    sput-object v0, Lti0/h$a;->a:Lti0/h$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZZ)Lti0/h;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, Lti0/h$c;

    invoke-direct {p1, p2}, Lti0/h$c;-><init>(Z)V

    return-object p1

    :cond_0
    sget-object p1, Lti0/h$b;->b:Lti0/h$b;

    return-object p1
.end method
