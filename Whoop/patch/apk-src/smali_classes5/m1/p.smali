.class public abstract synthetic Lm1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lt83/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/time/DayOfWeek;->values()[Ljava/time/DayOfWeek;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lm1/p;->a:Lt83/b;

    return-void
.end method
