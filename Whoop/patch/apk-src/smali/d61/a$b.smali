.class public final Ld61/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld61/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld61/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Ld61/a$b;",
        "Ld61/a;",
        "<init>",
        "()V",
        "",
        "",
        "Lcz0/s;",
        "b",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "scrubbedData",
        "",
        "c",
        "Ljava/lang/Float;",
        "a",
        "()Ljava/lang/Float;",
        "positionOfX",
        "design_release"
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
.field public static final a:Ld61/a$b;

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcz0/s;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/lang/Float;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld61/a$b;

    invoke-direct {v0}, Ld61/a$b;-><init>()V

    sput-object v0, Ld61/a$b;->a:Ld61/a$b;

    sget-object v0, Lm83/z;->w:Lm83/z;

    sput-object v0, Ld61/a$b;->b:Ljava/util/Map;

    const/16 v0, 0x8

    sput v0, Ld61/a$b;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Float;
    .locals 1

    sget-object v0, Ld61/a$b;->c:Ljava/lang/Float;

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcz0/s;",
            ">;"
        }
    .end annotation

    sget-object v0, Ld61/a$b;->b:Ljava/util/Map;

    return-object v0
.end method
