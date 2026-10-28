.class public final Lop0/g;
.super Lop0/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lop0/g;",
        "Lop0/h;",
        "<init>",
        "()V",
        "sleep-coach_release"
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
.field public static final b:Lop0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lop0/g;

    invoke-direct {v0}, Lop0/g;-><init>()V

    sput-object v0, Lop0/g;->b:Lop0/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "COMPLETE"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lop0/h;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
