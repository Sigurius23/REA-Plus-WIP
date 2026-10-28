.class public final Lrb3/t;
.super Lrb3/w;
.source "SourceFile"


# static fields
.field public static final c:Lrb3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb3/t;

    const-string v1, "Boolean"

    sget-object v2, Lrb3/h;->H:Lrb3/h;

    invoke-direct {v0, v1, v2}, Lrb3/w;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lrb3/t;->c:Lrb3/t;

    return-void
.end method
