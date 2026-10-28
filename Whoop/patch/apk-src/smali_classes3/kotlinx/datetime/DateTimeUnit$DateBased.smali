.class public abstract Lkotlinx/datetime/DateTimeUnit$DateBased;
.super Lkotlinx/datetime/DateTimeUnit;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/datetime/DateTimeUnit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "DateBased"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u00087\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Z>\u0008\u0007\u0010\u000e\"\u00020\u00042\u00020\u0004B0\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0008(\u0007\u0012\"\u0008\u0008\u0012\u001e\u0008\u000bB\u001a\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u000c\u0008\u000c\u0012\u0008\u0008\u000cJ\u0004\u0008\u0008(\rZ>\u0008\u0007\u0010\u0012\"\u00020\u000f2\u00020\u000fB0\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0008(\u0010\u0012\"\u0008\u0008\u0012\u001e\u0008\u000bB\u001a\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0011\u0012\u000c\u0008\u000c\u0012\u0008\u0008\u000cJ\u0004\u0008\u0008(\r\u0082\u0001\u0002\u0004\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlinx/datetime/DateTimeUnit$DateBased;",
        "Lkotlinx/datetime/DateTimeUnit;",
        "<init>",
        "()V",
        "Lkotlinx/datetime/DateTimeUnit$DayBased;",
        "Ll83/c;",
        "message",
        "Use DateTimeUnit.DayBased",
        "replaceWith",
        "Ll83/l;",
        "expression",
        "DateTimeUnit.DayBased",
        "imports",
        "kotlinx.datetime.DateTimeUnit",
        "DayBased",
        "Lkotlinx/datetime/DateTimeUnit$MonthBased;",
        "Use DateTimeUnit.MonthBased",
        "DateTimeUnit.MonthBased",
        "MonthBased",
        "Companion",
        "kotlinx/datetime/b",
        "kotlinx-datetime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lvc3/a;
.end annotation


# static fields
.field public static final Companion:Lkotlinx/datetime/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/datetime/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/datetime/DateTimeUnit$DateBased;->Companion:Lkotlinx/datetime/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lkotlinx/datetime/DateTimeUnit;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/datetime/DateTimeUnit$DateBased;-><init>()V

    return-void
.end method
