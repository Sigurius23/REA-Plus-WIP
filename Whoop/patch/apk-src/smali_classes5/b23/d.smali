.class public final Lb23/d;
.super Lb23/f;
.source "SourceFile"


# static fields
.field public static final a:Lb23/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb23/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb23/d;->a:Lb23/d;

    return-void
.end method


# virtual methods
.method public final log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    const-string p4, "tag"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "message"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lb23/c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    return-void
.end method
