.class public abstract Lx30/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lad3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwz/h1;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lwz/h1;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lx30/d1;->a:Lad3/r;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    const-string v0, "str"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lx30/d1;->a:Lad3/r;

    new-instance v1, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->Companion:Lcom/stripe/android/ui/core/elements/z;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/z;->serializer()Lwc3/c;

    move-result-object v2

    invoke-direct {v1, v2}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-virtual {v0, v1, p0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "STRIPE"

    const-string v2, "Error parsing LPMs"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-object p0
.end method
