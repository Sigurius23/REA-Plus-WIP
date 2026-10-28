.class public final Lio/ktor/utils/io/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lio/ktor/utils/io/p;

.field public static final b:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/ktor/utils/io/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/ktor/utils/io/p;->a:Lio/ktor/utils/io/p;

    sget-object v0, Lio/ktor/utils/io/o;->w:Lio/ktor/utils/io/o;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/p;->b:Ll83/p;

    return-void
.end method

.method public static a()Lio/ktor/utils/io/q;
    .locals 1

    sget-object v0, Lio/ktor/utils/io/p;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/q;

    return-object v0
.end method
