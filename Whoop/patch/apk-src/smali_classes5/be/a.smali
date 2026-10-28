.class public final Lbe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbe/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbe/a;->a:Lbe/a;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lbe/b;
    .locals 3

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ipv4"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lbe/b;->y:Lbe/b;

    return-object p0

    :cond_0
    const-string v1, "ipv6"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lbe/b;->z:Lbe/b;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid EndpointMode: `"

    const/16 v2, 0x60

    invoke-static {v2, v1, p0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
