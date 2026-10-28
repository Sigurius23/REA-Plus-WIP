.class public final Lqh2/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqh2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqh2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lqh2/a$d;",
        "Lqh2/a;",
        "<init>",
        "()V",
        "",
        "b",
        "J",
        "a",
        "()J",
        "historyCycleStartTime",
        "strap-pipeline-analytics_release"
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
.field public static final a:Lqh2/a$d;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqh2/a$d;

    invoke-direct {v0}, Lqh2/a$d;-><init>()V

    sput-object v0, Lqh2/a$d;->a:Lqh2/a$d;

    const-wide/16 v0, -0x1

    sput-wide v0, Lqh2/a$d;->b:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    sget-wide v0, Lqh2/a$d;->b:J

    return-wide v0
.end method
