.class public final Le33/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Le33/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le33/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Le33/b;->w:Le33/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/webrtc/RtpParameters$Encoding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lj33/d;->d(Lorg/webrtc/RtpParameters$Encoding;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
