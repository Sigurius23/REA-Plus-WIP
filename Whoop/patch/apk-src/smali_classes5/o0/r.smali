.class public final Lo0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lo0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo0/r;->w:Lo0/r;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    const/4 p1, 0x0

    return-object p1
.end method
