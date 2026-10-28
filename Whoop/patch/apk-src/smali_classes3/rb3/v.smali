.class public final Lrb3/v;
.super Lrb3/w;
.source "SourceFile"


# static fields
.field public static final c:Lrb3/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb3/v;

    const-string v1, "Unit"

    sget-object v2, Lrb3/h;->J:Lrb3/h;

    invoke-direct {v0, v1, v2}, Lrb3/w;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lrb3/v;->c:Lrb3/v;

    return-void
.end method
