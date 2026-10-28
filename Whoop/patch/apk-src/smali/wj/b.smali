.class public abstract Lwj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lad3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lwj/a;->w:Lwj/a;

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lwj/b;->a:Lad3/r;

    return-void
.end method
