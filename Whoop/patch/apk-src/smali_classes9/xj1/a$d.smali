.class public final Lxj1/a$d;
.super Lxj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxj1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lxj1/a$d;",
        "Lxj1/a;",
        "Lyg2/d;",
        "initialHr",
        "<init>",
        "(Lyg2/d;)V",
        "a",
        "Lyg2/d;",
        "()Lyg2/d;",
        "health-monitor_release"
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
.field public static final b:I


# instance fields
.field private final a:Lyg2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lyg2/d;->a:I

    sput v0, Lxj1/a$d;->b:I

    return-void
.end method

.method public constructor <init>(Lyg2/d;)V
    .locals 1

    const-string v0, "initialHr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxj1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lxj1/a$d;->a:Lyg2/d;

    return-void
.end method


# virtual methods
.method public final a()Lyg2/d;
    .locals 1

    iget-object v0, p0, Lxj1/a$d;->a:Lyg2/d;

    return-object v0
.end method
