.class public final Lbt0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lbt0/a;",
        "",
        "<init>",
        "()V",
        "Lorg/joda/time/DateTime;",
        "localDateTime",
        "Lbt0/b;",
        "a",
        "(Lorg/joda/time/DateTime;)Lbt0/b;",
        "connectivity-core_release"
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
.field public static final a:Lbt0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbt0/a;

    invoke-direct {v0}, Lbt0/a;-><init>()V

    sput-object v0, Lbt0/a;->a:Lbt0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/joda/time/DateTime;)Lbt0/b;
    .locals 1

    const-string v0, "localDateTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbt0/b;

    invoke-direct {v0, p1}, Lbt0/b;-><init>(Lorg/joda/time/DateTime;)V

    return-object v0
.end method
