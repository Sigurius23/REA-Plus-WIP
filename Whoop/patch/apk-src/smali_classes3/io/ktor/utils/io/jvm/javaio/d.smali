.class public abstract Lio/ktor/utils/io/jvm/javaio/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/ktor/utils/io/jvm/javaio/c;->w:Lio/ktor/utils/io/jvm/javaio/c;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/jvm/javaio/d;->a:Ll83/p;

    return-void
.end method

.method public static final a(Lbc3/k1;Lio/ktor/utils/io/q;)Lio/ktor/utils/io/jvm/javaio/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/ktor/utils/io/jvm/javaio/h;

    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/jvm/javaio/h;-><init>(Lbc3/k1;Lio/ktor/utils/io/q;)V

    return-object v0
.end method
