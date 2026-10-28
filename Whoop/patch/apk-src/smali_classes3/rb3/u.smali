.class public final Lrb3/u;
.super Lrb3/w;
.source "SourceFile"


# static fields
.field public static final c:Lrb3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb3/u;

    const-string v1, "Int"

    sget-object v2, Lrb3/h;->I:Lrb3/h;

    invoke-direct {v0, v1, v2}, Lrb3/w;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lrb3/u;->c:Lrb3/u;

    return-void
.end method
