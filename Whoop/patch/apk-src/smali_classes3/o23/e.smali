.class public final Lo23/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lo23/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo23/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo23/e;->w:Lo23/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
