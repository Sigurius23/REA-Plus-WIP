.class public final Lgz1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgz1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgz1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lgz1/d;",
        "Lgz1/a;",
        "<init>",
        "()V",
        "Lec3/l;",
        "Lgz1/b;",
        "a",
        "()Lec3/l;",
        "motion-tracking-sandbox_release"
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
.field public static final a:Lgz1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgz1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgz1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgz1/d;->a:Lgz1/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lgz1/b$c;

    const-string v1, "No detection engine is bound yet. motion-tracking-provider will replace this stub."

    invoke-direct {v0, v1}, Lgz1/b$c;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v1
.end method
