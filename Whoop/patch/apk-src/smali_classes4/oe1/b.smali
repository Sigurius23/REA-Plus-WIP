.class public final Loe1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loe1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Loe1/b;",
        "",
        "Lz82/b;",
        "analyticsManager",
        "<init>",
        "(Lz82/b;)V",
        "Loe1/a;",
        "analyticsEvent",
        "Ll83/a0;",
        "a",
        "(Loe1/a;)V",
        "Lz82/b;",
        "b",
        "education_release"
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
.field public static final b:Loe1/b$a;

.field public static final c:I


# instance fields
.field private final a:Lz82/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loe1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loe1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Loe1/b;->b:Loe1/b$a;

    const/16 v0, 0x8

    sput v0, Loe1/b;->c:I

    return-void
.end method

.method public constructor <init>(Lz82/b;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe1/b;->a:Lz82/b;

    return-void
.end method


# virtual methods
.method public final a(Loe1/a;)V
    .locals 7

    const-string v0, "analyticsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Loe1/b;->a:Lz82/b;

    invoke-interface {p1}, Loe1/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Loe1/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Loe1/a;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Loe1/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1}, Loe1/a;->d()Ljava/util/Map;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
