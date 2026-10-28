.class public abstract Lje/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ltg/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ltg/g;

    new-instance v1, Li93/c;

    const/16 v2, 0x20

    int-to-char v2, v2

    const/16 v3, 0x7f

    int-to-char v3, v3

    invoke-direct {v1, v2, v3}, Li93/a;-><init>(CC)V

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "trace header"

    invoke-direct {v0, v2, v1}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v0, Lje/c;->a:Ltg/g;

    return-void
.end method
